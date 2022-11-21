import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisq extends ahcz implements aheo
{
    public static final aisq a;
    private static volatile ahev l;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    private int m;
    
    static {
        ahcz.registerDefaultInstance(aisq.class, a = new aisq());
    }
    
    private aisq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = aisq.l) == null) {
                    synchronized (aisq.class) {
                        if (aisq.l == null) {
                            aisq.l = (ahev)new ahcs((ahcz)aisq.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aisq.a;
            }
            case 4: {
                return new ahcr((ahcz)aisq.a);
            }
            case 3: {
                return new aisq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisq.a, "\u0001\n\u0000\u0001\u000b\"\n\u0000\u0000\u0000\u000b\u1007\u0007\u0012\u1007\u000e\u0015\u1007\u0011\u0016\u1007\u0014\u0018\u1007\u0012\u0019\u1007\u0013\u001a\u1007\u0016\u001d\u1007\u001b\u001f\u1007\u001c\"\u1007\u001e", new Object[] { "m", "b", "c", "d", "g", "e", "f", "h", "i", "j", "k" });
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
