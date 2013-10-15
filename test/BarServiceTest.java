import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import models.Bar;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import services.BarBO;
import configs.AppConfig;

@ContextConfiguration(classes={AppConfig.class, TestDataConfig.class})
public class BarServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private BarBO barService;

    @Test
    public void createBar() {
        Bar bar = new Bar();
        bar.name = "foo";
        barService.add(bar);
        assertThat(bar.id).isNotNull();
    }

    @Test
    public void getBars() {
        createBar();
        List<Bar> bars = barService.getAll();
        assertThat(bars.size()).isEqualTo(1);
    }

}