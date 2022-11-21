import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyl extends ahcz implements aheo
{
    public static final apyl a;
    private static volatile ahev f;
    public int b;
    public albj c;
    public String d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(apyl.class, a = new apyl());
    }
    
    private apyl() {
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
                final ahev f;
                if ((f = apyl.f) == null) {
                    synchronized (apyl.class) {
                        if (apyl.f == null) {
                            apyl.f = (ahev)new ahcs((ahcz)apyl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apyl.a;
            }
            case 4: {
                return new ahcr((ahcz)apyl.a);
            }
            case 3: {
                return new apyl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyl.a, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0007\u1008\u0007\r\u1007\u000b", new Object[] { "b", "c", "d", "e" });
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
