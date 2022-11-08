import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahna extends agzi implements ahax
{
    public static final ahna a;
    public static final agzg b;
    private static volatile ahbe i;
    public int c;
    public aioe d;
    public aioe e;
    public int f;
    public int g;
    public CommandOuterClass$Command h;
    private byte j;
    
    static {
        final ahna a2 = new ahna();
        agzi.registerDefaultInstance(ahna.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 387215479, ahcm.k, ahna.class);
    }
    
    private ahna() {
        this.j = 2;
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
                final ahbe i;
                if ((i = ahna.i) == null) {
                    synchronized (ahna.class) {
                        if (ahna.i == null) {
                            ahna.i = (ahbe)new agzb((agzi)ahna.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahna.a;
            }
            case 4: {
                return new agza((agzi)ahna.a);
            }
            case 3: {
                return new ahna();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahna.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
