package ar.com.educacionit.web.servlet;

import ar.com.educacionit.dao.exceptions.GenericException;
import ar.com.educacionit.dtos.LoginDTO;
import ar.com.educacionit.services.exceptions.ServiceException;

public class LoginServiceImpl implements LoginService {

	private LoginDAO loginDao;
	
	public LoginServiceImpl() {
		this.loginDao = new LoginDaoJDBCImpl();
	}
	
	@Override
	public boolean login(LoginDTO loginDto) throws ServiceException {		
		try {
			return loginDao.loguear(loginDto);
		} catch (GenericException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
