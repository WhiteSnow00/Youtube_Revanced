import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojv extends ahcz implements aheo
{
    public static final aojv a;
    private static volatile ahev e;
    public ahdp b;
    public ahbt c;
    public int d;
    private int f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aojv.class, a = new aojv());
    }
    
    private aojv() {
        this.h = 2;
        this.b = ahcz.emptyProtobufList();
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aojv.e) == null) {
                    synchronized (aojv.class) {
                        if (aojv.e == null) {
                            aojv.e = (ahev)new ahcs((ahcz)aojv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aojv.a;
            }
            case 4: {
                return new ahcr((ahcz)aojv.a);
            }
            case 3: {
                return new aojv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojv.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000\u0003\u100a\u0001\u0004\u100c\u0002", new Object[] { "f", "b", ajws.class, "g", "c", "d", aoha.l });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
