/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class CmUpdateRel extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1653914389;

    /**
     * The parameter <code>kloopzcm.cm_update_rel.p_rel_id</code>.
     */
    public static final Parameter<Long> P_REL_ID = createParameter("p_rel_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_rel.p_comments</code>.
     */
    public static final Parameter<String> P_COMMENTS = createParameter("p_comments", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_rel.p_state_id</code>.
     */
    public static final Parameter<Integer> P_STATE_ID = createParameter("p_state_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_rel.p_last_rfc_id</code>.
     */
    public static final Parameter<Long> P_LAST_RFC_ID = createParameter("p_last_rfc_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public CmUpdateRel() {
        super("cm_update_rel", Kloopzcm.KLOOPZCM);

        addInParameter(P_REL_ID);
        addInParameter(P_COMMENTS);
        addInParameter(P_STATE_ID);
        addInParameter(P_LAST_RFC_ID);
    }

    /**
     * Set the <code>p_rel_id</code> parameter IN value to the routine
     */
    public void setPRelId(Long value) {
        setValue(P_REL_ID, value);
    }

    /**
     * Set the <code>p_comments</code> parameter IN value to the routine
     */
    public void setPComments(String value) {
        setValue(P_COMMENTS, value);
    }

    /**
     * Set the <code>p_state_id</code> parameter IN value to the routine
     */
    public void setPStateId(Integer value) {
        setValue(P_STATE_ID, value);
    }

    /**
     * Set the <code>p_last_rfc_id</code> parameter IN value to the routine
     */
    public void setPLastRfcId(Long value) {
        setValue(P_LAST_RFC_ID, value);
    }
}
