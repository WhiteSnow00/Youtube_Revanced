import android.database.CursorIndexOutOfBoundsException;
import java.util.ArrayList;
import android.database.AbstractCursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwt extends AbstractCursor
{
    private static final String[] b;
    public final ArrayList a;
    
    static {
        b = new String[] { "_id", "suggest_text_1", "suggest_text_2", "suggest_intent_query" };
    }
    
    public acwt() {
        this.a = new ArrayList(10);
    }
    
    public final String[] getColumnNames() {
        return acwt.b;
    }
    
    public final int getCount() {
        return this.a.size();
    }
    
    public final double getDouble(final int n) {
        return Double.parseDouble(this.getString(n));
    }
    
    public final float getFloat(final int n) {
        return Float.parseFloat(this.getString(n));
    }
    
    public final int getInt(final int n) {
        return Integer.parseInt(this.getString(n));
    }
    
    public final long getLong(final int n) {
        if (n == 0) {
            return this.mPos;
        }
        return Long.parseLong(this.getString(n));
    }
    
    public final short getShort(final int n) {
        return Short.parseShort(this.getString(n));
    }
    
    public final String getString(final int n) {
        if (this.mPos < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        }
        if (this.mPos >= this.a.size()) {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
        if (n != 3 && n != 1) {
            return null;
        }
        return this.a.get(this.mPos).b;
    }
    
    public final boolean isNull(final int n) {
        return this.getString(n) == null;
    }
}
