/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.nogroddb;


import burst.pool.migrator.nogroddb.tables.Account;
import burst.pool.migrator.nogroddb.tables.Block;
import burst.pool.migrator.nogroddb.tables.Miner;
import burst.pool.migrator.nogroddb.tables.NonceSubmission;
import burst.pool.migrator.nogroddb.tables.SchemaMigrations;
import burst.pool.migrator.nogroddb.tables.Transaction;
import burst.pool.migrator.nogroddb.tables.TransactionRecipient;
import burst.pool.migrator.nogroddb.tables.records.AccountRecord;
import burst.pool.migrator.nogroddb.tables.records.BlockRecord;
import burst.pool.migrator.nogroddb.tables.records.MinerRecord;
import burst.pool.migrator.nogroddb.tables.records.NonceSubmissionRecord;
import burst.pool.migrator.nogroddb.tables.records.SchemaMigrationsRecord;
import burst.pool.migrator.nogroddb.tables.records.TransactionRecipientRecord;
import burst.pool.migrator.nogroddb.tables.records.TransactionRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>nogrod_vlp</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<NonceSubmissionRecord, Long> IDENTITY_NONCE_SUBMISSION = Identities0.IDENTITY_NONCE_SUBMISSION;
    public static final Identity<TransactionRecord, Long> IDENTITY_TRANSACTION = Identities0.IDENTITY_TRANSACTION;
    public static final Identity<TransactionRecipientRecord, Long> IDENTITY_TRANSACTION_RECIPIENT = Identities0.IDENTITY_TRANSACTION_RECIPIENT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> KEY_ACCOUNT_PRIMARY = UniqueKeys0.KEY_ACCOUNT_PRIMARY;
    public static final UniqueKey<AccountRecord> KEY_ACCOUNT_ADDRESS_UNIQUE = UniqueKeys0.KEY_ACCOUNT_ADDRESS_UNIQUE;
    public static final UniqueKey<BlockRecord> KEY_BLOCK_PRIMARY = UniqueKeys0.KEY_BLOCK_PRIMARY;
    public static final UniqueKey<MinerRecord> KEY_MINER_PRIMARY = UniqueKeys0.KEY_MINER_PRIMARY;
    public static final UniqueKey<NonceSubmissionRecord> KEY_NONCE_SUBMISSION_PRIMARY = UniqueKeys0.KEY_NONCE_SUBMISSION_PRIMARY;
    public static final UniqueKey<NonceSubmissionRecord> KEY_NONCE_SUBMISSION_BLOCK_MINER_UNIQUE = UniqueKeys0.KEY_NONCE_SUBMISSION_BLOCK_MINER_UNIQUE;
    public static final UniqueKey<SchemaMigrationsRecord> KEY_SCHEMA_MIGRATIONS_PRIMARY = UniqueKeys0.KEY_SCHEMA_MIGRATIONS_PRIMARY;
    public static final UniqueKey<TransactionRecord> KEY_TRANSACTION_PRIMARY = UniqueKeys0.KEY_TRANSACTION_PRIMARY;
    public static final UniqueKey<TransactionRecipientRecord> KEY_TRANSACTION_RECIPIENT_PRIMARY = UniqueKeys0.KEY_TRANSACTION_RECIPIENT_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BlockRecord, AccountRecord> WINNER_ACCOUNT_FK = ForeignKeys0.WINNER_ACCOUNT_FK;
    public static final ForeignKey<BlockRecord, NonceSubmissionRecord> NONCE_SUBMISSION_FK = ForeignKeys0.NONCE_SUBMISSION_FK;
    public static final ForeignKey<MinerRecord, AccountRecord> MINER_ACCOUNT_FK = ForeignKeys0.MINER_ACCOUNT_FK;
    public static final ForeignKey<NonceSubmissionRecord, AccountRecord> MINER_FK = ForeignKeys0.MINER_FK;
    public static final ForeignKey<NonceSubmissionRecord, BlockRecord> MINER_BLOCK_FK = ForeignKeys0.MINER_BLOCK_FK;
    public static final ForeignKey<TransactionRecord, BlockRecord> TRANSACTION_BLOCK_FK = ForeignKeys0.TRANSACTION_BLOCK_FK;
    public static final ForeignKey<TransactionRecipientRecord, TransactionRecord> TRANSACTION_RECIPIENT_TRANSACTION_FK = ForeignKeys0.TRANSACTION_RECIPIENT_TRANSACTION_FK;
    public static final ForeignKey<TransactionRecipientRecord, AccountRecord> TRANSACTION_RECIPIENT_ACCOUNT_FK = ForeignKeys0.TRANSACTION_RECIPIENT_ACCOUNT_FK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<NonceSubmissionRecord, Long> IDENTITY_NONCE_SUBMISSION = Internal.createIdentity(NonceSubmission.NONCE_SUBMISSION, NonceSubmission.NONCE_SUBMISSION.ID);
        public static Identity<TransactionRecord, Long> IDENTITY_TRANSACTION = Internal.createIdentity(Transaction.TRANSACTION, Transaction.TRANSACTION.ID);
        public static Identity<TransactionRecipientRecord, Long> IDENTITY_TRANSACTION_RECIPIENT = Internal.createIdentity(TransactionRecipient.TRANSACTION_RECIPIENT, TransactionRecipient.TRANSACTION_RECIPIENT.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountRecord> KEY_ACCOUNT_PRIMARY = Internal.createUniqueKey(Account.ACCOUNT, "KEY_account_PRIMARY", Account.ACCOUNT.ID);
        public static final UniqueKey<AccountRecord> KEY_ACCOUNT_ADDRESS_UNIQUE = Internal.createUniqueKey(Account.ACCOUNT, "KEY_account_address_UNIQUE", Account.ACCOUNT.ADDRESS);
        public static final UniqueKey<BlockRecord> KEY_BLOCK_PRIMARY = Internal.createUniqueKey(Block.BLOCK, "KEY_block_PRIMARY", Block.BLOCK.HEIGHT);
        public static final UniqueKey<MinerRecord> KEY_MINER_PRIMARY = Internal.createUniqueKey(Miner.MINER, "KEY_miner_PRIMARY", Miner.MINER.ID);
        public static final UniqueKey<NonceSubmissionRecord> KEY_NONCE_SUBMISSION_PRIMARY = Internal.createUniqueKey(NonceSubmission.NONCE_SUBMISSION, "KEY_nonce_submission_PRIMARY", NonceSubmission.NONCE_SUBMISSION.ID);
        public static final UniqueKey<NonceSubmissionRecord> KEY_NONCE_SUBMISSION_BLOCK_MINER_UNIQUE = Internal.createUniqueKey(NonceSubmission.NONCE_SUBMISSION, "KEY_nonce_submission_block_miner_UNIQUE", NonceSubmission.NONCE_SUBMISSION.BLOCK_HEIGHT, NonceSubmission.NONCE_SUBMISSION.MINER_ID);
        public static final UniqueKey<SchemaMigrationsRecord> KEY_SCHEMA_MIGRATIONS_PRIMARY = Internal.createUniqueKey(SchemaMigrations.SCHEMA_MIGRATIONS, "KEY_schema_migrations_PRIMARY", SchemaMigrations.SCHEMA_MIGRATIONS.VERSION);
        public static final UniqueKey<TransactionRecord> KEY_TRANSACTION_PRIMARY = Internal.createUniqueKey(Transaction.TRANSACTION, "KEY_transaction_PRIMARY", Transaction.TRANSACTION.ID);
        public static final UniqueKey<TransactionRecipientRecord> KEY_TRANSACTION_RECIPIENT_PRIMARY = Internal.createUniqueKey(TransactionRecipient.TRANSACTION_RECIPIENT, "KEY_transaction_recipient_PRIMARY", TransactionRecipient.TRANSACTION_RECIPIENT.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BlockRecord, AccountRecord> WINNER_ACCOUNT_FK = Internal.createForeignKey(burst.pool.migrator.nogroddb.Keys.KEY_ACCOUNT_PRIMARY, Block.BLOCK, "winner_account_fk", Block.BLOCK.WINNER_ID);
        public static final ForeignKey<BlockRecord, NonceSubmissionRecord> NONCE_SUBMISSION_FK = Internal.createForeignKey(burst.pool.migrator.nogroddb.Keys.KEY_NONCE_SUBMISSION_PRIMARY, Block.BLOCK, "nonce_submission_fk", Block.BLOCK.BEST_NONCE_SUBMISSION_ID);
        public static final ForeignKey<MinerRecord, AccountRecord> MINER_ACCOUNT_FK = Internal.createForeignKey(burst.pool.migrator.nogroddb.Keys.KEY_ACCOUNT_PRIMARY, Miner.MINER, "miner_account_fk", Miner.MINER.ID);
        public static final ForeignKey<NonceSubmissionRecord, AccountRecord> MINER_FK = Internal.createForeignKey(burst.pool.migrator.nogroddb.Keys.KEY_ACCOUNT_PRIMARY, NonceSubmission.NONCE_SUBMISSION, "miner_fk", NonceSubmission.NONCE_SUBMISSION.MINER_ID);
        public static final ForeignKey<NonceSubmissionRecord, BlockRecord> MINER_BLOCK_FK = Internal.createForeignKey(burst.pool.migrator.nogroddb.Keys.KEY_BLOCK_PRIMARY, NonceSubmission.NONCE_SUBMISSION, "miner_block_fk", NonceSubmission.NONCE_SUBMISSION.BLOCK_HEIGHT);
        public static final ForeignKey<TransactionRecord, BlockRecord> TRANSACTION_BLOCK_FK = Internal.createForeignKey(burst.pool.migrator.nogroddb.Keys.KEY_BLOCK_PRIMARY, Transaction.TRANSACTION, "transaction_block_fk", Transaction.TRANSACTION.BLOCK_HEIGHT);
        public static final ForeignKey<TransactionRecipientRecord, TransactionRecord> TRANSACTION_RECIPIENT_TRANSACTION_FK = Internal.createForeignKey(burst.pool.migrator.nogroddb.Keys.KEY_TRANSACTION_PRIMARY, TransactionRecipient.TRANSACTION_RECIPIENT, "transaction_recipient_transaction_fk", TransactionRecipient.TRANSACTION_RECIPIENT.TRANSACTION_ID);
        public static final ForeignKey<TransactionRecipientRecord, AccountRecord> TRANSACTION_RECIPIENT_ACCOUNT_FK = Internal.createForeignKey(burst.pool.migrator.nogroddb.Keys.KEY_ACCOUNT_PRIMARY, TransactionRecipient.TRANSACTION_RECIPIENT, "transaction_recipient_account_fk", TransactionRecipient.TRANSACTION_RECIPIENT.RECIPIENT_ID);
    }
}