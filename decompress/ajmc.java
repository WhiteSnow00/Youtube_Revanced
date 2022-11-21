import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmc extends ahcz implements aheo
{
    public static final ajmc a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public String d;
    private anxb f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ajmc.class, a = new ajmc());
    }
    
    private ajmc() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ajmc.e) == null) {
                    synchronized (ajmc.class) {
                        if (ajmc.e == null) {
                            ajmc.e = (ahev)new ahcs((ahcz)ajmc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajmc.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmc.a);
            }
            case 3: {
                return new ajmc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmc.a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1008\u0000\b\u1409\u0003", new Object[] { "b", "c", ajlz.class, "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
