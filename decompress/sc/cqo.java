import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqo implements cqm
{
    private final cft a;
    private final cfq b;
    
    public cqo(final cft a) {
        this.a = a;
        this.b = (cfq)new cqn(a);
    }
    
    public final Long a(final String s) {
        final cfv a = cfv.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.g(1, s);
        this.a.j();
        final Cursor d = bsg.d(this.a, (cgs)a, false);
        try {
            final boolean moveToFirst = d.moveToFirst();
            Long value = null;
            if (moveToFirst) {
                if (d.isNull(0)) {
                    value = value;
                }
                else {
                    value = d.getLong(0);
                }
            }
            return value;
        }
        finally {
            d.close();
            a.j();
        }
    }
    
    public final void b(final cql cql) {
        this.a.j();
        this.a.k();
        try {
            this.b.a((Object)cql);
            this.a.n();
        }
        finally {
            this.a.l();
        }
    }
}
