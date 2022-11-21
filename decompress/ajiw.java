import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiw extends ahcz implements aheo
{
    public static final ajiw a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public ahdp d;
    public int e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ajiw.class, a = new ajiw());
    }
    
    private ajiw() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
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
                final ahev f;
                if ((f = ajiw.f) == null) {
                    synchronized (ajiw.class) {
                        if (ajiw.f == null) {
                            ajiw.f = (ahev)new ahcs((ahcz)ajiw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajiw.a;
            }
            case 4: {
                return new ahcr((short[][][])null, (short[])null);
            }
            case 3: {
                return new ajiw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajiw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001\u041b\u0002\u041b\u0003\u100c\u0000", new Object[] { "b", "c", aowb.class, "d", aowb.class, "e", aqbo.a() });
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
