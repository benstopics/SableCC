/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ABoolExpr extends PExpr
{
    private TBoolVal _boolVal_;

    public ABoolExpr()
    {
        // Constructor
    }

    public ABoolExpr(
        @SuppressWarnings("hiding") TBoolVal _boolVal_)
    {
        // Constructor
        setBoolVal(_boolVal_);

    }

    @Override
    public Object clone()
    {
        return new ABoolExpr(
            cloneNode(this._boolVal_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABoolExpr(this);
    }

    public TBoolVal getBoolVal()
    {
        return this._boolVal_;
    }

    public void setBoolVal(TBoolVal node)
    {
        if(this._boolVal_ != null)
        {
            this._boolVal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolVal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._boolVal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._boolVal_ == child)
        {
            this._boolVal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._boolVal_ == oldChild)
        {
            setBoolVal((TBoolVal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
