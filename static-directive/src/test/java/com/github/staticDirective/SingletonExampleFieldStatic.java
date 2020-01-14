package com.github.staticDirective;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import com.github.staticDirective.lib.SingletonTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SingletonExampleFieldStatic {

    @Test
    public void checkInstanceSingleton() {
        SingletonTest instance = SingletonTest.getInstance(3);
        assertThat(instance, instanceOf(SingletonTest.class));
        assertEquals(instance.getI(), 3);

        instance = SingletonTest.getInstance(4);
        assertEquals(instance.getI(), 3);
    }

}