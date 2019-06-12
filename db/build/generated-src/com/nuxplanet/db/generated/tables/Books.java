/*
 * This file is generated by jOOQ.
 */
package com.nuxplanet.db.generated.tables;


import com.nuxplanet.db.generated.Indexes;
import com.nuxplanet.db.generated.Keys;
import com.nuxplanet.db.generated.Public;
import com.nuxplanet.db.generated.tables.records.BooksRecord;

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
public class Books extends TableImpl<BooksRecord> {

    private static final long serialVersionUID = 1355641333;

    /**
     * The reference instance of <code>PUBLIC.BOOKS</code>
     */
    public static final Books BOOKS = new Books();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BooksRecord> getRecordType() {
        return BooksRecord.class;
    }

    /**
     * The column <code>PUBLIC.BOOKS.ID</code>.
     */
    public final TableField<BooksRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOKS.ISBN</code>.
     */
    public final TableField<BooksRecord, String> ISBN = createField("ISBN", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOKS.TITLE</code>.
     */
    public final TableField<BooksRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOKS.DESCRIPTION</code>.
     */
    public final TableField<BooksRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>PUBLIC.BOOKS</code> table reference
     */
    public Books() {
        this(DSL.name("BOOKS"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOKS</code> table reference
     */
    public Books(String alias) {
        this(DSL.name(alias), BOOKS);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOKS</code> table reference
     */
    public Books(Name alias) {
        this(alias, BOOKS);
    }

    private Books(Name alias, Table<BooksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Books(Name alias, Table<BooksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Books(Table<O> child, ForeignKey<O, BooksRecord> key) {
        super(child, key, BOOKS);
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
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BooksRecord> getPrimaryKey() {
        return Keys.PK_BOOKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BooksRecord>> getKeys() {
        return Arrays.<UniqueKey<BooksRecord>>asList(Keys.PK_BOOKS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Books as(String alias) {
        return new Books(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Books as(Name alias) {
        return new Books(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Books rename(String name) {
        return new Books(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Books rename(Name name) {
        return new Books(name, null);
    }
}
