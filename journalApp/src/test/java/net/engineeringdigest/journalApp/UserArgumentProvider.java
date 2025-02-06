package net.engineeringdigest.journalApp;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.springframework.security.core.userdetails.User;

import java.security.cert.Extension;
import java.util.stream.Stream;

public class UserArgumentProvider implements ArgumentsProvider {
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(User.builder().username("ededed").password("shyam").build()),
                Arguments.of(User.builder().username("ededed").password("").build())
        );
    }
}
