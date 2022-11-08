import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajrr extends agzd implements agze
{
    public static final ajrr a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public agzy e;
    public ahas f;
    public ajrp g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)ajrr.class, (agzi)(a = new ajrr()));
    }
    
    private ajrr() {
        this.f = ahas.a;
        this.i = 2;
        this.c = "";
        this.d = "";
        this.e = agzi.emptyProtobufList();
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
                final ahbe h;
                if ((h = ajrr.h) == null) {
                    synchronized (ajrr.class) {
                        if (ajrr.h == null) {
                            ajrr.h = (ahbe)new agzb((agzi)ajrr.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajrr.a;
            }
            case 4: {
                return new agzc(ajrr.a);
            }
            case 3: {
                return new ajrr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajrr.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001a\u00042\u0005\u1409\u0002", new Object[] { "b", "c", "d", "e", "f", ajrq.a, "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
