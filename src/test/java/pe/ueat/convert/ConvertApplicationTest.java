package pe.ueat.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.builder.SpringApplicationBuilder;

@ExtendWith(MockitoExtension.class)
public class ConvertApplicationTest {

    @Mock
	private SpringApplicationBuilder springApplicationBuilder;
	 
	@Test
    public void validateGetterSettet(){

		ConvertApplication servletInitializer = new ConvertApplication();
	    when(springApplicationBuilder.sources(ConvertApplication.class)).thenReturn(springApplicationBuilder);

	    SpringApplicationBuilder result = servletInitializer.configure(springApplicationBuilder);

	    verify(springApplicationBuilder).sources(ConvertApplication.class);
	    assertEquals(springApplicationBuilder,result);
	    String[] args = new String[1];
	    args[0] = "--spring.output.ansi.enabled=always";

	    ConvertApplication.main(args);
	}
}
