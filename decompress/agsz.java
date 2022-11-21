import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsz extends ahcz implements aheo
{
    public static final agsz a;
    private static volatile ahev d;
    public int b;
    public long c;
    
    static {
        ahcz.registerDefaultInstance(agsz.class, a = new agsz());
    }
    
    private agsz() {
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = agsz.d) == null) {
                    synchronized (agsz.class) {
                        if (agsz.d == null) {
                            agsz.d = (ahev)new ahcs((ahcz)agsz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agsz.a;
            }
            case 4: {
                return new ahcr((ahcz)agsz.a);
            }
            case 3: {
                return new agsz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
