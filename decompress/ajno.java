import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajno extends ahcz implements aheo
{
    public static final ajno a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public ahdg e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(ajno.class, a = new ajno());
    }
    
    private ajno() {
        this.e = ahcz.emptyFloatList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = ajno.g) == null) {
                    synchronized (ajno.class) {
                        if (ajno.g == null) {
                            ajno.g = (ahev)new ahcs((ahcz)ajno.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajno.a;
            }
            case 4: {
                return new ahcr((char[][])null, (char[][][])null);
            }
            case 3: {
                return new ajno();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajno.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u0013\u0004\u100c\u0002", new Object[] { "b", "c", "d", "e", "f", aprh.c });
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
