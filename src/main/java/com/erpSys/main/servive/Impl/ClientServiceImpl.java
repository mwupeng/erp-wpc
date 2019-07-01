package com.erpSys.main.servive.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.ClientMapper;
import com.erpSys.main.model.Client;
import com.erpSys.main.model.Clientaddress;
import com.erpSys.main.service.ClientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements ClientService {

	@Autowired
	private ClientMapper clientMapper;

	@Override
	public PageInfo<Client> selectByPage(int pageNo, int pageSize) {
		EntityWrapper<Client> wrapper = new EntityWrapper<Client>();
		PageHelper.startPage(pageNo, pageSize);
		wrapper.eq("status", "A");
		List<Client> list = selectList(wrapper);
		PageInfo<Client> page = new PageInfo<Client>(list);
		return page;
	}

	@Override
	public boolean delById(Integer id) {
		EntityWrapper<Client> wrapper = new EntityWrapper<Client>();
		wrapper.eq("id", id);
		Client entity = new Client();
		entity.setStatus("B");
		boolean judeg = update(entity, wrapper);
		return judeg;
	}

	@Override
	public boolean ClientDelList(List<String> list) {
		boolean judeg = false;
		for (String string : list) {
			EntityWrapper<Client> wrapper = new EntityWrapper<Client>();
			wrapper.eq("id", string);
			Client entity = new Client();
			entity.setStatus("B");
			judeg = update(entity, wrapper);
		}
		return judeg;
	}

	@Override
	public boolean ClientInsert(Client client) {
		boolean judeg = insert(client);
		return judeg;

	}

	@Override
	public boolean UpdateClientById(Client client, Integer id) {
		EntityWrapper<Client> wrapper = new EntityWrapper<Client>();
		wrapper.eq("id", id);
		boolean judeg = update(client, wrapper);
		return judeg;
	}

	@Override
	public Client selectExit(Integer id) {
		EntityWrapper<Client> wrapper = new EntityWrapper<Client>();
		wrapper.eq("id", id);
		Client client = selectById(id);
		return client;
	}

	@Override
	public List<Client> selectAddress(String name) {
		List<Client> list = clientMapper.selectAddress(name);
		return list;
	}

	@Override
	public List<Client> selectName() {
		List<Client> list = clientMapper.selectName();
		return list;
	}

	@Override
	public List<Client> selectList() {
		EntityWrapper<Client> wrapper = new EntityWrapper<Client>();
		List<Client> list = selectList(wrapper);
		return list;
	}

}
