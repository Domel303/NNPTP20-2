package cz.upce.fei.inptp.zz.service.crypto;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Dependency injector module for {@link CryptoFileService} and {@link CryptoFileService}.
 *
 * @author Ondřej Chrbolka
 *
 * */
public class CryptoFileServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CryptoService.class).to(CryptoFileService.class).in(Singleton.class);
    }
}
