// 
// Decompiled by Procyon v0.6.0
// 

public final class cnf extends bsa
{
    public static final cnf a;
    
    static {
        a = new cnf();
    }
    
    private cnf() {
    }
    
    public final void c(final cgl cgl) {
        cgl.d();
        try {
            final StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            sb.append(System.currentTimeMillis() - cny.a);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            cgl.g(sb.toString());
            cgl.h();
        }
        finally {
            cgl.f();
        }
    }
}
