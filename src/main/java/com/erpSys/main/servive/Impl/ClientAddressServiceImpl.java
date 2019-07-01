package com.erpSys.main.servive.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.ClientMapper;
import com.erpSys.main.mapper.ClientaddressMapper;
import com.erpSys.main.model.Client;
import com.erpSys.main.model.Clientaddress;
import com.erpSys.main.service.ClientAddressService;
import com.erpSys.main.service.ClientService;

@Service
public class ClientAddressServiceImpl extends ServiceImpl<ClientaddressMapper, Clientaddress>
		implements ClientAddressService {

	@Autowired
	private ClientaddressMapper clientaddressMapper;

	@Autowired
	private ClientMapper clientMapper;

	@Override
	public List<Client> selectaddress(String name) {
		List<Client> list = clientMapper.selectAddress(name);
		return list;
	}

	@Override
	public List<Clientaddress> selectClient() {
		List<Clientaddress> list = clientaddressMapper.selectClient();
		return list;
	}

	@Override
	public boolean ClientAddressIn(Clientaddress clientaddress, String name) {
		List<Client> list = clientMapper.selectAddress(name);
		clientaddress.setClientid(list.get(0).getClientaddress().getClientid());
		boolean judeg = insert(clientaddress);
		return judeg;
	}

	@Override
	public boolean Delect(Integer id) {
		EntityWrapper<Clientaddress> wrapper = new EntityWrapper<Clientaddress>();
		wrapper.eq("id", id);
		boolean judeg = delete(wrapper);
		return judeg;
	}

	@Override
	public boolean DelList(List<String> list) {
		boolean judeg = deleteBatchIds(list);
		return judeg;
	}

	@Override
	public List<Clientaddress> selectAddress(Integer id) {
		EntityWrapper<Clientaddress> wrapper = new EntityWrapper<Clientaddress>();
		wrapper.eq("id", id);
		List<Clientaddress> list = selectList(wrapper);
		return list;
	}

	@Override
	public boolean updateEntity(Clientaddress clientaddress, Integer id) {
		EntityWrapper<Clientaddress> wrapper = new EntityWrapper<Clientaddress>();
		wrapper.eq("id", id);
		boolean judeg = update(clientaddress, wrapper);
		return judeg;
	}

	@Override
	public List<Clientaddress> selectClentById(Integer id) {
		List<Clientaddress> list = clientaddressMapper.selectClientByid(id);
		return list;
	}
}
