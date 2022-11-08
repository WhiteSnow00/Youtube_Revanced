import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apeb extends agzi implements ahax
{
    public static final apeb a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public agzy d;
    public agzy e;
    public aioe f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apeb.class, a = new apeb());
    }
    
    private apeb() {
        this.h = 2;
        this.c = "";
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyProtobufList();
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
                final ahbe g;
                if ((g = apeb.g) == null) {
                    synchronized (apeb.class) {
                        if (apeb.g == null) {
                            apeb.g = (ahbe)new agzb((agzi)apeb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apeb.a;
            }
            case 4: {
                return new agza((agzi)apeb.a);
            }
            case 3: {
                return new apeb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apeb.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0001\u0001\u1008\u0000\u0002\u001b\u0003\u001b\u0005\u1409\u0002", new Object[] { "b", "c", "d", aoaf.class, "e", aoaf.class, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
