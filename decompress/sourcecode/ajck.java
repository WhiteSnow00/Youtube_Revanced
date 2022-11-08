import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajck extends agzi implements ahax
{
    public static final ajck a;
    public static final agzg b;
    private static volatile ahbe n;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public aqdk h;
    public CommandOuterClass$Command i;
    public CommandOuterClass$Command j;
    public boolean k;
    public ajkh l;
    public int m;
    private byte o;
    
    static {
        final ajck a2 = new ajck();
        agzi.registerDefaultInstance(ajck.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 183321338, ahcm.k, ajck.class);
    }
    
    private ajck() {
        this.o = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
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
                final ahbe n;
                if ((n = ajck.n) == null) {
                    synchronized (ajck.class) {
                        if (ajck.n == null) {
                            ajck.n = (ahbe)new agzb((agzi)ajck.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ajck.a;
            }
            case 4: {
                return new agza((agzi)ajck.a);
            }
            case 3: {
                return new ajck();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajck.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0004\t\u1007\b\n\u1409\t\u000b\u100c\n", new Object[] { "c", "d", "e", "f", "g", "i", "j", "h", "k", "l", "m", ajcg.c });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
