import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqz extends ahcz implements aheo
{
    public static final apqz a;
    private static volatile ahev f;
    public int b;
    public String c;
    public apni d;
    public apni e;
    
    static {
        ahcz.registerDefaultInstance(apqz.class, a = new apqz());
    }
    
    private apqz() {
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
                final ahev f;
                if ((f = apqz.f) == null) {
                    synchronized (apqz.class) {
                        if (apqz.f == null) {
                            apqz.f = (ahev)new ahcs((ahcz)apqz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqz.a;
            }
            case 4: {
                return new ahcr((ahcz)apqz.a);
            }
            case 3: {
                return new apqz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
