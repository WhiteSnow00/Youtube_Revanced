import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvu extends cvw
{
    private final eab e;
    
    public cvu(final List list) {
        super(list);
        int i = 0;
        final eab eab = (eab)list.get(0).b;
        if (eab != null) {
            i = eab.i();
        }
        this.e = new eab(new float[i], new int[i]);
    }
    
    public final /* bridge */ Object f(final czs czs, final float n) {
        final eab e = this.e;
        final eab eab = (eab)czs.b;
        final eab eab2 = (eab)czs.c;
        final int length = ((int[])eab.b).length;
        final int length2 = ((int[])eab2.b).length;
        if (length == length2) {
            for (int i = 0; i < ((int[])eab.b).length; ++i) {
                ((float[])e.a)[i] = czm.c(((float[])eab.a)[i], ((float[])eab2.a)[i], n);
                ((int[])e.b)[i] = cja.d(n, ((int[])eab.b)[i], ((int[])eab2.b)[i]);
            }
            return this.e;
        }
        final StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(length);
        sb.append(" vs ");
        sb.append(length2);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
