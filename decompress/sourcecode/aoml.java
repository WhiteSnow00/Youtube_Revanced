import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoml extends agzi implements ahax
{
    public static final aoml a;
    private static volatile ahbe o;
    public int b;
    public agzy c;
    public aioe d;
    public anss e;
    public aioe f;
    public boolean g;
    public ahld h;
    public ahjr i;
    public agyc j;
    public int k;
    public boolean l;
    public agzy m;
    public agzy n;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance((Class)aoml.class, (agzi)(a = new aoml()));
    }
    
    private aoml() {
        this.q = 2;
        this.c = emptyProtobufList();
        this.j = agyc.b;
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
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
                final ahbe o3;
                if ((o3 = aoml.o) == null) {
                    synchronized (aoml.class) {
                        if (aoml.o == null) {
                            aoml.o = (ahbe)new agzb((agzi)aoml.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return aoml.a;
            }
            case 4: {
                return new agza((agzi)aoml.a);
            }
            case 3: {
                return new aoml();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoml.a, "\u0001\r\u0000\u0001\u0001\u0019\r\u0000\u0003\u0007\u0001\u041b\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1007\u0003\u0006\u1409\u0004\u0007\u1009\u0005\b\u1409\u0006\t\u100a\u0007\n\u100c\b\u000b\u1007\t\f\u041b\u0019\u001b", new Object[] { "b", "c", aomn.class, "d", "e", "f", "g", "h", "i", "p", "j", "k", aomi.a(), "l", "n", aorm.class, "m", aomj.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
