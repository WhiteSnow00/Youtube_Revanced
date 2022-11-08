import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmf extends agzi implements ahax
{
    public static final ajmf a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public ajsq d;
    public agzy e;
    public ahfw f;
    public agyc g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)ajmf.class, (agzi)(a = new ajmf()));
    }
    
    private ajmf() {
        this.i = 2;
        this.c = "";
        this.e = agzi.emptyProtobufList();
        emptyProtobufList();
        this.g = agyc.b;
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
                if ((h = ajmf.h) == null) {
                    synchronized (ajmf.class) {
                        if (ajmf.h == null) {
                            ajmf.h = (ahbe)new agzb((agzi)ajmf.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajmf.a;
            }
            case 4: {
                return new agza((short[])null, (byte[][])null);
            }
            case 3: {
                return new ajmf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmf.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u001a\u0004\u1409\u0005\u0005\u100a\u0006", new Object[] { "b", "c", "d", "e", "f", "g" });
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
