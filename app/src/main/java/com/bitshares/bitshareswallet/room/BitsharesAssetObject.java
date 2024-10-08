package com.bitshares.bitshareswallet.room;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.bitshares.bitshareswallet.wallet.graphene.chain.asset_object;
import com.bitshares.bitshareswallet.wallet.graphene.chain.object_id;

/**
 * Created by lorne on 31/10/2017.
 */

@Entity(tableName = "asset_object", indices = {@Index(value = {"asset_id", "symbol"}, unique = true)})
public class BitsharesAssetObject {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public object_id<asset_object> asset_id;
    public String symbol;
    public long precision;
}
