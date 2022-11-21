import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidj extends ahcz implements aheo
{
    public static final aidj a;
    private static volatile ahev e;
    public int b;
    public long c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(aidj.class, a = new aidj());
    }
    
    private aidj() {
        this.d = "";
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
                if ((e = aidj.e) == null) {
                    synchronized (aidj.class) {
                        if (aidj.e == null) {
                            aidj.e = (ahev)new ahcs((ahcz)aidj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aidj.a;
            }
            case 4: {
                return new ahcr((ahcz)aidj.a);
            }
            case 3: {
                return new aidj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
