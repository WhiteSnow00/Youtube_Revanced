import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyk extends ahcz implements aheo
{
    public static final apyk a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apyk.class, a = new apyk());
    }
    
    private apyk() {
        emptyIntList();
        this.c = "";
        emptyIntList();
        emptyIntList();
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
                if ((d = apyk.d) == null) {
                    synchronized (apyk.class) {
                        if (apyk.d == null) {
                            apyk.d = (ahev)new ahcs((ahcz)apyk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apyk.a;
            }
            case 4: {
                return new ahcr((ahcz)apyk.a);
            }
            case 3: {
                return new apyk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyk.a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0000\u000b\u1008\t", new Object[] { "b", "c" });
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
