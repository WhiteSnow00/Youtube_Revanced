import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknu extends agzi implements ahax
{
    public static final aknu a;
    private static volatile ahbe f;
    public akjf b;
    public akns c;
    public apjz d;
    public agyc e;
    private int g;
    private ahfw h;
    private anss i;
    private ajtl j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aknu.class, a = new aknu());
    }
    
    private aknu() {
        this.k = 2;
        this.e = agyc.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aknu.f) == null) {
                    synchronized (aknu.class) {
                        if (aknu.f == null) {
                            aknu.f = (ahbe)new agzb((agzi)aknu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aknu.a;
            }
            case 4: {
                return new agza((agzi)aknu.a);
            }
            case 3: {
                return new aknu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknu.a, "\u0001\u0007\u0000\u0001\u0001\u0309\u0007\u0000\u0000\u0006\u0001\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1409\u0007\u0309\u1409\b", new Object[] { "g", "b", "c", "d", "h", "e", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
