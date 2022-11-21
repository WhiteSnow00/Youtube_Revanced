import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsp extends ahcz implements aheo
{
    public static final aqsp a;
    private static volatile ahev e;
    public int b;
    public ahej c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(aqsp.class, a = new aqsp());
    }
    
    private aqsp() {
        this.c = ahej.a;
    }
    
    public final ahej a() {
        final ahej c = this.c;
        if (!c.b) {
            this.c = c.a();
        }
        return this.c;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqsp.e) == null) {
                    synchronized (aqsp.class) {
                        if (aqsp.e == null) {
                            aqsp.e = (ahev)new ahcs((ahcz)aqsp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqsp.a;
            }
            case 4: {
                return new ahcr((char[][][])null, (byte[][])null);
            }
            case 3: {
                return new aqsp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002\u1003\u0000", new Object[] { "b", "c", aqso.a, "d" });
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
