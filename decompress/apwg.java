import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwg extends ahcz implements aheo
{
    public static final apwg a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(apwg.class, a = new apwg());
    }
    
    private apwg() {
        emptyProtobufList();
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
                if ((e = apwg.e) == null) {
                    synchronized (apwg.class) {
                        if (apwg.e == null) {
                            apwg.e = (ahev)new ahcs((ahcz)apwg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apwg.a;
            }
            case 4: {
                return new ahcr((ahcz)apwg.a);
            }
            case 3: {
                return new apwg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
