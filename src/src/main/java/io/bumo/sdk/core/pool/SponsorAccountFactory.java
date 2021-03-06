package io.bumo.sdk.core.pool;

import io.bumo.sdk.core.spi.OperationService;

/**
 * @author bumo
 * @since 18/03/12 3:03 p.m.
 * Account pool factory, responsible for initializing the account pool
 */
public interface SponsorAccountFactory{

    /**
     * Initialization account pool
     *
     * @param OperationService Operating object
     * @param address
     * @param publicKey
     * @param privateKey
     * @param size               Account pool size
     * @param filePath           For storing file path, absolute path must be given if default config/sponsorAccountPool.txt is not transmitted
     * @param sponsorAccountMark Metadata markers for all sponsor accounts，key=$$$SponsorAccountPoolMark$$$
     * @return Account pool
     */
    SponsorAccountPool initPool(OperationService operationService, String address, String publicKey, String privateKey, Integer size, String filePath, String sponsorAccountMark);


}
