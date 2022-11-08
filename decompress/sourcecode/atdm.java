// 
// Decompiled by Procyon v0.6.0
// 

public final class atdm extends asgt
{
    final atib b;
    final int c;
    
    public atdm(final atib b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    protected final void at(final aujp aujp) {
        final atdl atdl = new atdl(aujp, this.b.a(), this.c);
        aujp.f((aujq)atdl);
        final atib b = this.b;
        final atdj[] b2 = atdl.b;
        if (b.c((aujp[])b2)) {
            final int length = b2.length;
            final aujp[] array = new aujp[length];
            final int n = 0;
            for (int i = 0; i < length; ++i) {
                final atdj atdj = b2[i];
                final atdf atdf = (atdf)b;
                array[i] = (aujp)asov.a((aujp)atdj, atdf.b, Integer.MAX_VALUE, atdf.c);
            }
            final atib a = ((atdf)b).a;
            if (a.c(array)) {
                final aujp[] array2 = new aujp[length];
                final atdr atdr = (atdr)a;
                final asho b3 = atdr.b;
                int j = n;
                if (b3 instanceof atgo) {
                    ((atgo)b3).b(length, new atdo(atdr, array, array2));
                }
                else {
                    while (j < length) {
                        atdr.b(j, array, array2, atdr.b.a());
                        ++j;
                    }
                }
                final atib a2 = atdr.a;
                if (a2.c(array2)) {
                    final atdi atdi = (atdi)a2;
                    atdi.a.as((aujp)new atdh(array2, atdi.c));
                }
            }
        }
    }
}
