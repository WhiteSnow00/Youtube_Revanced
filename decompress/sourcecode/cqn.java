import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqn implements cql
{
    private final cfs a;
    private final cfp b;
    
    public cqn(final cfs a) {
        this.a = a;
        this.b = (cfp)new cqm(a);
    }
    
    public final Long a(final String s) {
        final cfu a = cfu.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.g(1, s);
        this.a.j();
        final Cursor d = bsf.d(this.a, (cgr)a, false);
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
    
    public final void b(final cqk cqk) {
        this.a.j();
        this.a.k();
        try {
            this.b.a(cqk);
            this.a.n();
        }
        finally {
            this.a.l();
        }
    }
}
