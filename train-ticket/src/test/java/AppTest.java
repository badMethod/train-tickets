import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pers.train.ticket.dao.TicketDetailMapper;
import pers.train.ticket.model.TicketDetail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-mybatis.xml" })
public class AppTest {

	@Autowired
	TicketDetailMapper detailMapper;
	
	@Test
	public void test() {
		TicketDetail td = detailMapper.selectByPrimaryKey(1);
		System.out.println(td.toString());
	}

}
