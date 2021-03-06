/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.CmOpsActionsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
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
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmOpsActions extends TableImpl<CmOpsActionsRecord> {

    private static final long serialVersionUID = -691328286;

    /**
     * The reference instance of <code>kloopzcm.cm_ops_actions</code>
     */
    public static final CmOpsActions CM_OPS_ACTIONS = new CmOpsActions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmOpsActionsRecord> getRecordType() {
        return CmOpsActionsRecord.class;
    }

    /**
     * The column <code>kloopzcm.cm_ops_actions.ops_action_id</code>.
     */
    public final TableField<CmOpsActionsRecord, Long> OPS_ACTION_ID = createField("ops_action_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.ops_proc_id</code>.
     */
    public final TableField<CmOpsActionsRecord, Long> OPS_PROC_ID = createField("ops_proc_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.ci_id</code>.
     */
    public final TableField<CmOpsActionsRecord, Long> CI_ID = createField("ci_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.action_name</code>.
     */
    public final TableField<CmOpsActionsRecord, String> ACTION_NAME = createField("action_name", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.arglist</code>.
     */
    public final TableField<CmOpsActionsRecord, String> ARGLIST = createField("arglist", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.payload</code>.
     */
    public final TableField<CmOpsActionsRecord, String> PAYLOAD = createField("payload", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.exec_order</code>.
     */
    public final TableField<CmOpsActionsRecord, Integer> EXEC_ORDER = createField("exec_order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.state_id</code>.
     */
    public final TableField<CmOpsActionsRecord, Integer> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.is_critical</code>.
     */
    public final TableField<CmOpsActionsRecord, Boolean> IS_CRITICAL = createField("is_critical", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.extra_info</code>.
     */
    public final TableField<CmOpsActionsRecord, String> EXTRA_INFO = createField("extra_info", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.created</code>.
     */
    public final TableField<CmOpsActionsRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>kloopzcm.cm_ops_actions.updated</code>.
     */
    public final TableField<CmOpsActionsRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>kloopzcm.cm_ops_actions</code> table reference
     */
    public CmOpsActions() {
        this(DSL.name("cm_ops_actions"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.cm_ops_actions</code> table reference
     */
    public CmOpsActions(String alias) {
        this(DSL.name(alias), CM_OPS_ACTIONS);
    }

    /**
     * Create an aliased <code>kloopzcm.cm_ops_actions</code> table reference
     */
    public CmOpsActions(Name alias) {
        this(alias, CM_OPS_ACTIONS);
    }

    private CmOpsActions(Name alias, Table<CmOpsActionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmOpsActions(Name alias, Table<CmOpsActionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CM_OPS_ACTIONS_CI_ID_IDX, Indexes.CM_OPS_ACTIONS_CI_PROC_IDX, Indexes.CM_OPS_ACTIONS_PK, Indexes.CM_OPS_ACTIONS_PROC_ID_IDX, Indexes.CM_OPS_ACTIONS_STATE_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmOpsActionsRecord> getPrimaryKey() {
        return Keys.CM_OPS_ACTIONS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmOpsActionsRecord>> getKeys() {
        return Arrays.<UniqueKey<CmOpsActionsRecord>>asList(Keys.CM_OPS_ACTIONS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CmOpsActionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CmOpsActionsRecord, ?>>asList(Keys.CM_OPS_ACTIONS__CM_OPS_ACTIONS_PROC_FK, Keys.CM_OPS_ACTIONS__CM_OPS_ACTIONS_CI_FK, Keys.CM_OPS_ACTIONS__CM_OPS_ACTIONS_ST_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmOpsActions as(String alias) {
        return new CmOpsActions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmOpsActions as(Name alias) {
        return new CmOpsActions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CmOpsActions rename(String name) {
        return new CmOpsActions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CmOpsActions rename(Name name) {
        return new CmOpsActions(name, null);
    }
}
