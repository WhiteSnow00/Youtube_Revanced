import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcz extends ahcz implements aheo
{
    public static final akcz a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public ahbt e;
    
    static {
        ahcz.registerDefaultInstance(akcz.class, a = new akcz());
    }
    
    private akcz() {
        this.e = ahbt.b;
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
                if ((f = akcz.f) == null) {
                    synchronized (akcz.class) {
                        if (akcz.f == null) {
                            akcz.f = (ahev)new ahcs((ahcz)akcz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akcz.a;
            }
            case 4: {
                return new ahcr((ahcz)akcz.a);
            }
            case 3: {
                return new akcz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100a\u0002", new Object[] { "b", "c", akan.g, "d", akan.h, "e" });
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
