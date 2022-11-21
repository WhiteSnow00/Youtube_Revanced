import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlw extends ahcz implements aheo
{
    public static final ajlw a;
    private static volatile ahev e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(ajlw.class, a = new ajlw());
    }
    
    private ajlw() {
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
                final ahev e;
                if ((e = ajlw.e) == null) {
                    synchronized (ajlw.class) {
                        if (ajlw.e == null) {
                            ajlw.e = (ahev)new ahcs((ahcz)ajlw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajlw.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlw.a);
            }
            case 3: {
                return new ajlw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlw.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d" });
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
