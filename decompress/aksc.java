import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksc extends ahcz implements aheo
{
    public static final aksc a;
    private static volatile ahev f;
    public int b;
    public Object c;
    public aknj d;
    public ahbt e;
    private int g;
    private ahjl h;
    private ajxn i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aksc.class, a = new aksc());
    }
    
    private aksc() {
        this.b = 0;
        this.j = 2;
        ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aksc.f) == null) {
                    synchronized (aksc.class) {
                        if (aksc.f == null) {
                            aksc.f = (ahev)new ahcs((ahcz)aksc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aksc.a;
            }
            case 4: {
                return new ahcr((ahcz)aksc.a);
            }
            case 3: {
                return new aksc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksc.a, "\u0001\u0007\u0001\u0001\u0001\u0309\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u143c\u0000\u0003\u143c\u0000\u0004\u1409\u0005\u0005\u100a\u0006\u0006\u143c\u0000\u0309\u1409\u0007", new Object[] { "c", "b", "g", "d", anxb.class, ajrl.class, "h", "e", aisc.class, "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
