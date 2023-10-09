package com.bitshares.bitshareswallet.room;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.bitshares.bitshareswallet.wallet.account_object;
import com.bitshares.bitshareswallet.wallet.graphene.chain.object_id;

/**
 * Created by lorne on 31/10/2017.
 */

@Entity(tableName = "account_object",
        indices = @Index( value = {"account_id", "name"}, unique = true))
public class BitsharesAccountObject {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public object_id<account_object> account_id;
    public String name;
}
