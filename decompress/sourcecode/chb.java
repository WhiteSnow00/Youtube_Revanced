import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chb extends cha implements cgq
{
    private final SQLiteStatement a;
    
    public chb(final SQLiteStatement a) {
        super((SQLiteProgram)a);
        this.a = a;
    }
    
    public final void a() {
        this.a.executeInsert();
    }
    
    public final void b() {
        this.a.executeUpdateDelete();
    }
}
