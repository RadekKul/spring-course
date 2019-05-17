package soundsystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // jak to dodamy to juz obiekty dog nie beda tymi samymi beanami tylko roznymi i juz nasz test nie wyjdzie
public class Dog implements Animal{
}
