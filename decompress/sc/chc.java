import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chc extends chb implements cgr
{
    private final SQLiteStatement a;
    
    public chc(final SQLiteStatement a) {
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
