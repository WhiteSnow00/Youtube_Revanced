import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtf extends ahcz implements aheo
{
    public static final aqtf a;
    private static volatile ahev d;
    public boolean b;
    public String c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aqtf.class, a = new aqtf());
    }
    
    private aqtf() {
        this.c = "";
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
                if ((d = aqtf.d) == null) {
                    synchronized (aqtf.class) {
                        if (aqtf.d == null) {
                            aqtf.d = (ahev)new ahcs((ahcz)aqtf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqtf.a;
            }
            case 4: {
                return new ahcr((ahcz)aqtf.a);
            }
            case 3: {
                return new aqtf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqtf.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1007\u0002\u0004\u1008\u0003", new Object[] { "e", "b", "c" });
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
