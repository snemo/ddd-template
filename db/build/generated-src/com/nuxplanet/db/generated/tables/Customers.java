/*
 * This file is generated by jOOQ.
 */
package com.nuxplanet.db.generated.tables;


import com.nuxplanet.db.generated.Indexes;
import com.nuxplanet.db.generated.Keys;
import com.nuxplanet.db.generated.Public;
import com.nuxplanet.db.generated.tables.records.CustomersRecord;

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
public class Customers extends TableImpl<CustomersRecord> {

    private static final long serialVersionUID = 1254419371;

    /**
     * The reference instance of <code>PUBLIC.CUSTOMERS</code>
     */
    public static final Customers CUSTOMERS = new Customers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomersRecord> getRecordType() {
        return CustomersRecord.class;
    }

    /**
     * The column <code>PUBLIC.CUSTOMERS.ID</code>.
     */
    public final TableField<CustomersRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CUSTOMERS.FIRSTNAME</code>.
     */
    public final TableField<CustomersRecord, String> FIRSTNAME = createField("FIRSTNAME", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CUSTOMERS.LASTNAME</code>.
     */
    public final TableField<CustomersRecord, String> LASTNAME = createField("LASTNAME", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.CUSTOMERS</code> table reference
     */
    public Customers() {
        this(DSL.name("CUSTOMERS"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CUSTOMERS</code> table reference
     */
    public Customers(String alias) {
        this(DSL.name(alias), CUSTOMERS);
    }

    /**
     * Create an aliased <code>PUBLIC.CUSTOMERS</code> table reference
     */
    public Customers(Name alias) {
        this(alias, CUSTOMERS);
    }

    private Customers(Name alias, Table<CustomersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customers(Name alias, Table<CustomersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Customers(Table<O> child, ForeignKey<O, CustomersRecord> key) {
        super(child, key, CUSTOMERS);
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
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_6);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomersRecord> getPrimaryKey() {
        return Keys.PK_CUSTOMERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomersRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomersRecord>>asList(Keys.PK_CUSTOMERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customers as(String alias) {
        return new Customers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customers as(Name alias) {
        return new Customers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customers rename(String name) {
        return new Customers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customers rename(Name name) {
        return new Customers(name, null);
    }
}
