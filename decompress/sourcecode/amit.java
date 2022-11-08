import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amit extends agzi implements ahax
{
    public static final amit a;
    private static volatile ahbe k;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public aioe f;
    public amis g;
    public amir h;
    public ajsq i;
    public agyc j;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)amit.class, (agzi)(a = new amit()));
    }
    
    private amit() {
        this.m = 2;
        emptyProtobufList();
        this.j = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = amit.k) == null) {
                    synchronized (amit.class) {
                        if (amit.k == null) {
                            amit.k = (ahbe)new agzb((agzi)amit.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return amit.a;
            }
            case 4: {
                return new agza((agzi)amit.a);
            }
            case 3: {
                return new amit();
            }
            case 2: {
                return newMessageInfo((MessageLite)amit.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\b\u0006\u1409\t\u0007\u1409\u0004\b\u1409\u0005\n\u1409\u0007", new Object[] { "b", "c", "d", "e", "f", "j", "l", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
