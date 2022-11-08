import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akjf extends agzd implements agze
{
    public static final akjf a;
    private static volatile ahbe k;
    public int b;
    public String c;
    public agzy d;
    public int e;
    public ajwh f;
    public aivq g;
    public String h;
    public aoip i;
    public akzd j;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)akjf.class, (agzi)(a = new akjf()));
    }
    
    private akjf() {
        this.m = 2;
        this.c = "";
        this.d = emptyProtobufList();
        emptyProtobufList();
        agzi.emptyProtobufList();
        this.h = "";
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
                if ((k = akjf.k) == null) {
                    synchronized (akjf.class) {
                        if (akjf.k == null) {
                            akjf.k = (ahbe)new agzb((agzi)akjf.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akjf.a;
            }
            case 4: {
                return new agzc(akjf.a);
            }
            case 3: {
                return new akjf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akjf.a, "\u0001\b\u0000\u0001\u0002\u001b\b\u0000\u0001\u0002\u0002\u1008\u0001\u0006\u041b\u0007\u100b\u0003\u0010\u1409\f\u0016\u1009\u0011\u0018\u1008\u0013\u001a\u1009\u0014\u001b\u1009\u0015", new Object[] { "b", "c", "d", akjg.class, "e", "f", "g", "h", "i", "j" });
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
