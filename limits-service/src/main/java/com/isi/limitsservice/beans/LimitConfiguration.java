

package com.isi.limitsservice.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**  @Author Salmi Ismail**/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LimitConfiguration {

	private int maximum;
	private int minimum;
}

