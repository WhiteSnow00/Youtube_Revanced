import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrx extends ahcz implements aheo
{
    public static final aqrx a;
    private static volatile ahev i;
    public int b;
    public String c;
    public ahej d;
    public int e;
    public String f;
    public ahej g;
    public ahej h;
    
    static {
        ahcz.registerDefaultInstance(aqrx.class, a = new aqrx());
    }
    
    private aqrx() {
        this.d = ahej.a;
        final ahej a = ahej.a;
        this.g = a;
        this.h = a;
        this.c = "";
        this.f = "";
    }
    
    public final ahej a() {
        final ahej h = this.h;
        if (!h.b) {
            this.h = h.a();
        }
        return this.h;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = aqrx.i) == null) {
                    synchronized (aqrx.class) {
                        if (aqrx.i == null) {
                            aqrx.i = (ahev)new ahcs((ahcz)aqrx.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqrx.a;
            }
            case 4: {
                return new ahcr((int[][][])null, (float[])null);
            }
            case 3: {
                return new aqrx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrx.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0003\u0000\u0000\u0001\u1008\u0000\u00022\u0003\u1004\u0001\u0004\u1008\u0002\u00052\u00062", new Object[] { "b", "c", "d", aqrw.a, "e", "f", "g", aqrv.a, "h", aqru.a });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
