/*
 * This file is generated by jOOQ.
 */
package com.nuxplanet.db.generated.tables;


import com.nuxplanet.db.generated.Indexes;
import com.nuxplanet.db.generated.Keys;
import com.nuxplanet.db.generated.Public;
import com.nuxplanet.db.generated.tables.records.StockEventsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StockEvents extends TableImpl<StockEventsRecord> {

    private static final long serialVersionUID = -888610310;

    /**
     * The reference instance of <code>PUBLIC.STOCK_EVENTS</code>
     */
    public static final StockEvents STOCK_EVENTS = new StockEvents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StockEventsRecord> getRecordType() {
        return StockEventsRecord.class;
    }

    /**
     * The column <code>PUBLIC.STOCK_EVENTS.ID</code>.
     */
    public final TableField<StockEventsRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.STOCK_EVENTS.BOOK_ID</code>.
     */
    public final TableField<StockEventsRecord, String> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.STOCK_EVENTS.AMOUNT</code>.
     */
    public final TableField<StockEventsRecord, Integer> AMOUNT = createField("AMOUNT", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.STOCK_EVENTS.SEQUENCE_NUMBER</code>.
     */
    public final TableField<StockEventsRecord, Integer> SEQUENCE_NUMBER = createField("SEQUENCE_NUMBER", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.STOCK_EVENTS.EVENT_TYPE</code>.
     */
    public final TableField<StockEventsRecord, String> EVENT_TYPE = createField("EVENT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.STOCK_EVENTS</code> table reference
     */
    public StockEvents() {
        this(DSL.name("STOCK_EVENTS"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.STOCK_EVENTS</code> table reference
     */
    public StockEvents(String alias) {
        this(DSL.name(alias), STOCK_EVENTS);
    }

    /**
     * Create an aliased <code>PUBLIC.STOCK_EVENTS</code> table reference
     */
    public StockEvents(Name alias) {
        this(alias, STOCK_EVENTS);
    }

    private StockEvents(Name alias, Table<StockEventsRecord> aliased) {
        this(alias, aliased, null);
    }

    private StockEvents(Name alias, Table<StockEventsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> StockEvents(Table<O> child, ForeignKey<O, StockEventsRecord> key) {
        super(child, key, STOCK_EVENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EVENT_SEQUENCE_CONSTRAINT_INDEX_1, Indexes.PRIMARY_KEY_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StockEventsRecord> getPrimaryKey() {
        return Keys.PK_STOCK_EVENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StockEventsRecord>> getKeys() {
        return Arrays.<UniqueKey<StockEventsRecord>>asList(Keys.PK_STOCK_EVENTS, Keys.EVENT_SEQUENCE_CONSTRAINT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StockEvents as(String alias) {
        return new StockEvents(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StockEvents as(Name alias) {
        return new StockEvents(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StockEvents rename(String name) {
        return new StockEvents(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StockEvents rename(Name name) {
        return new StockEvents(name, null);
    }
}
